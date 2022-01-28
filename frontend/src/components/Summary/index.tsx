import { Container } from './styles';

export function Summary() {


    return (

        <Container>
            <div>
                <header> Total Clientes</header>
                <strong>250</strong>
            </div>
            <div>
                <header>Produtos Cadastrados</header>
                <strong>1580</strong>
            </div>
            <div>
                <header> Total Fornecedores</header>
                <strong>10</strong>
            </div>

        </Container>

    );
}