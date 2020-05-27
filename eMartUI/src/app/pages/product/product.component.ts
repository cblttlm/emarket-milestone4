import { Component, OnInit } from '@angular/core';
import {AuthenticationService} from '../../services/authentication.service';
import {RouterService} from '../../services/router.service';
import {QueryService} from '../../services/query.service';
import {Manufacturer} from '../../model/Manufacturer';
import {HomeService} from '../../services/home.service';
import {Product} from '../../model/product.model';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  userSeatchHistory;
  manufacturers: Manufacturer[];
  startPrice;
  endPrice;
  manufacturer;
  constructor(private authService: AuthenticationService,
              private routerService: RouterService,
              private queryService: QueryService,
              private homeService: HomeService) {
  }
  products: Product[];

  share() {
    window.alert('The product has been shared!');
  }

  onNotify() {
    window.alert('You will be notified when the product goes on sale');
  }
  ngOnInit(): void {
    this.homeService.getManufacturers().subscribe(data => {
      console.log(JSON.stringify(data));
      const manu: any = data;
      this.manufacturers = manu;
      console.log(this.manufacturers);
    });
  }
  filter() {
    this.homeService.getProducts(this.startPrice, this.endPrice, this.manufacturer).subscribe(data => {
      console.log(JSON.stringify(data));
      const product: any = data;
      this.products = product;
      this.queryService.products = product;
    });
  }

  changeCategory(value: any) {
    this.manufacturer = value;
  }

  changeEndPrice(value: any) {
    this.endPrice = value;
  }

  changeStartPrice(value: any) {
    this.startPrice = value;
  }
}
