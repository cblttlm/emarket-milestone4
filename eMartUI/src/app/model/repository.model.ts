import { Product } from './product.model';
import { SimpleDataSource } from "./datasource.model";
export class Model {
  datasource : SimpleDataSource;
  products : Product[];
  candidate = 100;
  locator = (p:Product, id:number) => p.id = id;
  constructor() {
    this.datasource = new SimpleDataSource();
    this.products = new Array<Product>();
    this.datasource.getData().forEach(p => this.products.push(p));
  }
  getProducts() : Product[]{
    return this.products;
  }
  getProduct(productId:number): Product {
    return this.products.find(p => this.locator(p,productId));
  }
  saveProduct(product:Product) {
    if (product.id == 0 || product.id == null) {
      product.id = this.generateID();
      this.products.push(product);
    } else {
      let index = this.products.findIndex(p => this.locator(p, product.id));
      this.products.splice(index, 1, product);
    }
  }
  deleteProduct(productId: number){
      let index = this.products.findIndex(p => this.locator(p, productId));
      if (index > -1) {
        this.products.splice(index, 1);
      }
    }
    private generateID(): number{
    return 100;
  }
}
