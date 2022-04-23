import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  newProduct: any;
  ProductService: any;


  constructor(private product:ProductService) { }

  ngOnInit(): void {
  } addNewProduct(form: { value: { product_category: any; product_name: any; product_description: any; product_rating: any; product_price: any; product_color: any; }; }){
    console.log(form.value);
  let newProduct = {
    id: 11,
    categoryId: form.value.product_category,
    productName: form.value.product_name,
    description: form.value.product_description,
    specification: '',
  
    productPrice: form.value.product_price,
    image: '',
   
};

console.log(newProduct);

this.ProductService.createProduct(newProduct).subscribe((data: any) => {
  console.log(data);
});

}
}