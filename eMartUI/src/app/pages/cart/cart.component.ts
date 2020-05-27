import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import {CartService} from '../../services/cart.service';
import {OrderService} from '../../services/order.service';
import {HomeService} from '../../services/home.service';

@Component({
  selector: 'app-cart',
  templateUrl: 'cart.component.html',
  styleUrls: ['cart.component.css']
})
export class CartComponent implements OnInit {
  items;
  checkoutForm;

  constructor(private cartService: CartService,private formBuilder:FormBuilder,private orderService:OrderService,private homeService: HomeService) {
      this.checkoutForm = this.formBuilder.group({
        name: '',
        address: ''
      });
    }

    ngOnInit() {
     this.homeService.getOrders().subscribe(data => {
      console.log(JSON.stringify(data));
      const order: any = data;
      this.items = order;
    });
      //this.items = this.cartService.getItems();
    }
  removeFromCart(order) {
    window.alert('Your product has been delete from the cart!');
    this.homeService.removeFromCart(order);
    this.ngOnInit();
    this.checkoutForm.reset();
    window.location.reload();
  }
    onSubmit(customerData) {
      // Process checkout data here
      this.orderService.addToOrderlist(this.items);
      this.homeService.savepurchasehistory(this.items);
      this.items = this.cartService.clearCart();
      this.checkoutForm.reset();
    }
  }
