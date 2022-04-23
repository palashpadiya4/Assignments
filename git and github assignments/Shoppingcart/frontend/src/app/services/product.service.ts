import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Product } from 'src/Product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  getAllProducts(): Observable<Product>{
    const productUrl = 'localhost:8081/products/';

    return this.http.get<Product>(productUrl); // return an observable
  }



  createProduct(productBody: any): Observable<Product>{
    const productUrl = 'localhost:8081/products/';

    return this.http.post<Product>(productUrl, productBody); // return an observable
  }

  viewProduct(productId: string): Observable<Product>{
    const productUrl = 'localhost:8081/products/'+ productId;
    return this.http.get<Product>(productUrl); // return an observable
  }}