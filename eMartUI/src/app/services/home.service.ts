import {Injectable, Type} from '@angular/core';
import {HttpClient, HttpErrorResponse, HttpHeaders, HttpParams} from '@angular/common/http';
import { environment } from 'src/environments/environment';
import {Product} from '../model/product.model';
import {ImageSlider, Manufacturer, SearchItem} from '../pages/sign-in/domain';
import {Order} from '../model/order';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import {Purchasehistory} from '../model/purchasehistory';
import {UserLogin} from '../model/userLogin';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class HomeService {
  private items: any;
  constructor(private http: HttpClient) {}
  getBanners() {
    return this.http.get<ImageSlider[]>(`${environment.baseUrl}/banners`);
  }
  getProducts(startPrice: string, endPrice: string, manufacturer: string) {
    return this.http.get<Product[]>(`${environment.baseUrl}/api/cloud-buyer-service/products`,
      { params: new HttpParams()
                .set('startPrice', startPrice)
                .set('endPrice', endPrice)
                .set('categoryId', manufacturer)});
  }

  getManufacturers() {
    console.log(httpOptions.headers.get('Authorization'));
    return this.http.get(`${environment.baseUrl}/api/cloud-buyer-service/api/manufacturer`,
      httpOptions);
  }
  saveOrder(product: Product)  {
    const order = new Order() ;
    order.price = product.price;
    order.remarks = product.remarks;
    // tslint:disable-next-line:radix
    order.buyerId = sessionStorage.getItem('userId');
    order.sellerId = sessionStorage.getItem('userId');
    order.itemName = product.itemName;
    order.transactionId = sessionStorage.getItem('token');
    order.numberOfItems = product.stockNumber;
    console.log('saveorder:' + httpOptions.headers.get('Authorization'));
    return this.http.post<Order>(`${environment.baseUrl}/api/cloud-buyer-service/order/saveorder`, order, httpOptions);
  }
  savepurchasehistory(purchasehistorys: Purchasehistory[]) {
    for (let i = 0; i < purchasehistorys.length; i++) {
       this.http.post(`${environment.baseUrl}/api/cloud-buyer-service/purchasehistory/savepurchaseHistory`, purchasehistorys[i],
        httpOptions).subscribe();
    }
  }
  getOrders() {
    return this.http.get<Order[]>(`${environment.baseUrl}/api/cloud-buyer-service/order?buyid=${sessionStorage.getItem('userId')}`,
      httpOptions);
  }
  getpurchasehistorys() {
    return this.http.get<Purchasehistory[]>(`${environment.baseUrl}/api/cloud-buyer-service/purchasehistory?buyid=${sessionStorage.getItem('userId')}`,
      httpOptions);
  }
  removeFromCart(order:Order) {
    return this.http.delete(`${environment.baseUrl}/api/cloud-buyer-service/order/${order.id}`,
      httpOptions).subscribe();
  }
  Register(user: UserLogin)  {
    this.http.post<UserLogin>(`${environment.baseUrl}/api/cloud-user-service/api/user/register`, user,httpOptions).subscribe();
  }
}
