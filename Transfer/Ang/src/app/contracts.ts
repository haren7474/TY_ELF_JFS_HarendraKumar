import { Product } from './product';

export interface Contract {
    contractId: number;
    customerId: number;
    haulierId: number;
    deliveryDate: Date;
    day: string;
    quantity: number;
    productBean: Product;
}

export interface ModifiedContract {
    contractId: number;
    customer: string;
    haulier: number;
    deliveryDate: Date;
    day: string;
    quantity: number;
    productBean: Product;
}
