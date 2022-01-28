import { useEffect, useState } from "react";
import { api } from "services/api";

import { Container } from "./styles";
interface Product {
    id: number,
    name: string,
    price: number,
    quantity: number,
    code: string,
    createdAt: string
}
export function ProductsTable() {
    const [products, setProducts] = useState<Product[]>([]);
    useEffect(() => {
        api.get('/product')
            .then(response => setProducts(response.data))

    }, []);
    return (

        <Container>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Preço</th>
                        <th>Quantidade</th>
                        <th>Código</th>
                        <th>Data</th>
                    </tr>
                </thead>

                <tbody>

                    {products.map(product => {
                        return (
                            <tr key={product.id}>
                                <td>{product.id}</td>
                                <td>{product.name}</td>
                                <td>
                                    {new Intl.NumberFormat('pt-BR', {
                                        style: 'currency',
                                        currency: 'BRL'
                                    }).format(product.price)}
                                </td>
                                <td>{product.quantity}</td>
                                <td>{product.code}</td>
                                <td>
                                    {new Intl.DateTimeFormat('pt-BR').format(
                                        new Date(product.createdAt))}
                                </td>
                            </tr>
                        )
                    }

                    )}


                </tbody>

            </table>
        </Container>
    );

}