// tslint:disable-next-line:class-name
export class Purchasehistory {
  constructor(public id?: string,
              public buyerId?: string,
              public sellerId?: string,
              public transactionId?: string,
              public itemName?: string,
              public numberOfItems?: number,
              public datetime?: Date,
              public price?: number,
              public remarks?: string
              ) {
}
}
