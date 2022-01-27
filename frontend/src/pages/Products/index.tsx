import ProductInfo from "components/ProductInfo";
function Products() {
    const product = {
        id: 1,
        code: 145454,

        image: "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg",
        description: "Maça",
        quantity: 2,
        price: 4.5
    };
    return (


        <div className="product-list-container">
            <h1>Lista de Produtos</h1>
            <div className="product-card-bottom-container">
                <p>Descrição: {product.description}</p>
                <p>Valor:      {product.price}</p>
            </div>
<ProductInfo />

        </div>

    )

}

export default Products;