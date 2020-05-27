export class Product{
  constructor(public id?:number,
              public itemName?:string,
              public categoryId?:number,
              public subCategoryId?:number,
              public price?:number,
              public stockNumber?:number,
              public discription?:string,
              public remarks?:string,
              public sellerId?:string) {
}
}
