import styled from "styled-components"

export const Container = styled.div`
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 3rem;
    margin-top: 2rem;
    margin: auto 3rem;

        div {

        background-color: var(--color-primary);
        padding: 1.5rem 1.5rem;
        border-radius: 0.25rem;
        color:whitesmoke;

        header{
            display:flex;
            align-items: center;
            justify-content: center;
        }
        strong{
            display:flex;
            margin-top: 0.75rem;
            justify-content: center;
            font-size: 2rem;
        }

        } 


`;