import {Product} from './product.model';

export class SimpleDataSource {
  private data: Product[];
  constructor() {
    // this.data = new Array<Product>(
    //   new Product(1, 'Kayak', 1, 297, 30, 1'),
    //   new Product(2, 'Lifejact', 2, 48.95, 50, 1)
    // );
  }
  getData(): Product[] {
    return this.data;
  }
}
