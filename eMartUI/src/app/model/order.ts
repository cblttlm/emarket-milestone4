export class Order {
  constructor(public id?: string,
              public buyerId?: string,
              public sellerId?: string,
              public transactionId?: string,
              public itemName?: string,
              public price?: number,
              public totalprice?: number,
              public numberOfItems?: number,
              public datetime?: Date,
              public remarks?: string
              ) {
}
}
