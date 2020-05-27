import { Injectable } from '@angular/core';
import {Model} from '../model/repository.model';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {Product} from '../model/product.model';
import {Order} from '../model/order';
import {environment} from '../../environments/environment';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    Authorization: 'Bearer ' + sessionStorage.getItem('token')
  })
};
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  model: Model;
  constructor(private http: HttpClient) {}

  saveItem(product: Product)  {
     this.http.post<Order>(`${environment.baseUrl}/api/cloud-seller-service/items/saveitem`, product, httpOptions).subscribe();
  }
  getItems(categoryId: string, subCategoryId: string) {
    return this.http.get<Product[]>(`${environment.baseUrl}/api/cloud-seller-service/items?categoryId=${categoryId}&subCategoryId=${subCategoryId}`,
      httpOptions);
  }
  getItemslist() {
    return this.http.get<Product[]>(`${environment.baseUrl}/api/cloud-seller-service/items/getitemlist?sellerId=${sessionStorage.getItem('userId')}`,
      httpOptions);
  }
}
