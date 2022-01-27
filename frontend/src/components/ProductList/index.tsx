import ProductItem from "components/ProductItem";
import { useEffect, useState } from "react";

interface Product{
    id: number,
    name: string,
    price: number,
    quantity: number,
    code: string
}
export function ProductList() {
    const [products, setProducts] = useState<Product[]>([]);

    useEffect(() => {
        fetch('https://61f311e02219930017f50a26.mockapi.io/product')
            .then(response => response.json())
            .then(data => setProducts(data))

    }, []);
    return (
        <ul>
            {products.map(product => {
                return <ProductItem key={product.id} product={product} />
            }

            )}
        </ul>

    );


}