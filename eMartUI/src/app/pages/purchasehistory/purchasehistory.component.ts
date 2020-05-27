import { Component, OnInit } from '@angular/core';
import {OrderService} from '../../services/order.service';
import {Product} from '../../model/product.model';
import {HomeService} from '../../services/home.service';
import {Purchasehistory} from '../../model/purchasehistory';

@Component({
  selector: 'app-purchasehistory',
  templateUrl: './purchasehistory.component.html',
  styleUrls: ['./purchasehistory.component.css']
})
export class PurchasehistoryComponent implements OnInit {
  purchasehistorys : Purchasehistory[];
  constructor(private orderService:OrderService,private homeService:HomeService) {
  }
  ngOnInit(): void {
    this.homeService.getpurchasehistorys().subscribe(data => {
      console.log(JSON.stringify(data));
      const purchasehistorys: any = data;
      this.purchasehistorys = purchasehistorys;
    });
   // this.productOrders = this.orderService.getOrderList();
  }
}
