function ProductItem(props) {

    return (
        <>
        <li>
        <span>ID: {props.product?.id}</span>
            <strong>Nome do Produto: {props.product?.name}</strong>
            <span>Preço: {props.product?.price}</span>
            <span>Quantidade: {props.product?.quantity}</span>
            <span>Codigo{props.product?.code}</span>
        </li>
            
        </>
    )
}

export default ProductItem;