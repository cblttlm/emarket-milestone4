import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { RouterService } from './router.service';
import {environment, environment1} from '../../environments/environment';
import { UserLogin } from '../model/userLogin';

const username = 'cloudsimpleservice';
const password = 'mysecret';
const httpOptions = {
    headers: new HttpHeaders({
      Authorization: 'Basic ' + btoa(username + ':' + password)
    })
};
@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private http:HttpClient) { }

  setToken(token) {
    sessionStorage.setItem('token', token);
  }

  getToken() {
    return sessionStorage.getItem('token');
  }

  setUserId(userId) {
    sessionStorage.setItem('userId', userId);
  }

  getUserId() {
    return sessionStorage.getItem('userId');
  }

  setAdmin(isAdmin) {
    sessionStorage.setItem('isAdmin', isAdmin);
  }

  getAdmin() {
    return sessionStorage.getItem('isAdmin');
  }
  public get currentUserToken(): string {
    return sessionStorage.getItem('token');
  }
   postSignIn(user) {
    return this.http.post(`${environment.baseUrl}/api/cloud-auth-service/auth/oauth/token?grant_type=password&scope=webclient&username=${user.userName}&password=${user.password}`,null , httpOptions);
}
  // logout() {
  //   sessionStorage.removeItem('userId');
  //   sessionStorage.removeItem('token');
  //   this.routerService.routeToLogin();
  // }
  //
  // adminLogout() {
  //   sessionStorage.removeItem('userId');
  //   sessionStorage.removeItem('token');
  //   this.routerService.routeToAdminLogin();
  // }
}
