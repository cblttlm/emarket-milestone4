import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {Product} from '../../model/product.model';
import {CartService} from '../../services/cart.service';
import {AuthenticationService} from '../../services/authentication.service';
import {RouterService} from '../../services/router.service';
import {QueryService} from '../../services/query.service';
import {HomeService} from '../../services/home.service';
import {Order} from '../../model/order';
import {getFileSystem} from '@angular/compiler-cli/src/ngtsc/file_system';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  product: Product;
  order: Order;
  constructor(
    private route: ActivatedRoute,
    private cartService: CartService,
    private queryService: QueryService,
    private homeService: HomeService
  ) {
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.product = this.queryService.products[+params.get('productId')];
    });
  }
  addToCart(product) {
    //window.alert('Your product has been added to the cart!');
    this.cartService.addToCart(product);
    this.homeService.saveOrder(product).subscribe();
    window.alert('Your product has been added to the cart!');
  }
  goBack(): void {
    // this.routerService.routeToProduct();
  }
}
