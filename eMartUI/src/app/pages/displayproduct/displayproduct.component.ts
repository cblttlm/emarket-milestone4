import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import {CartService} from '../../services/cart.service';
import {Model} from "../../model/repository.model"
import {Product} from '../../model/product.model';
import {ProductService} from '../../services/product.service';
@Component({
  selector: 'app-displayproduct',
  templateUrl: 'displayproduct.component.html',
  styleUrls: ['displayproduct.component.css']
})
export class DisplayProductComponent implements OnInit{
    products : Product[];
    constructor(private productService: ProductService) {
    }
    ngOnInit() {
       this.productService.getItemslist().subscribe(data => {
        console.log(JSON.stringify(data));
        const manu: any = data;
         this.products = manu;
        console.log(this.products);
      });
    }
  }
