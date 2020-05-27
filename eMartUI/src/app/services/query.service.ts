import { Injectable } from '@angular/core';
import { UserSearchSQL } from '../model/userSearchSQL';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { AuthenticationService } from './authentication.service';
import {Product} from '../model/product.model';

@Injectable({
  providedIn: 'root'
})
export class QueryService {
  userSearchSQL;
  products : Product[];
  constructor(private authService: AuthenticationService) { }
  setQuerySQL(userSearchSQL) {
    this.userSearchSQL = userSearchSQL;
  }
  getQuerySQL() {
    return this.userSearchSQL;
  }
  }
