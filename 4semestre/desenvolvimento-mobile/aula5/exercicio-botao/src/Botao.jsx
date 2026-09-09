export default function Botao({type='primary', size='medium', text, shadow='off', numero, funcao}) {
    cores = {
        primary: '#5e81ac',
        success: '#a3be8c',
        error: '#bf616a',
        secondary: '#4c566a'
    };

    tamanhos = {
        small: {width: '100px', height: '20px'} ,
        medium: {width: '150px', height: '40px'},
        large: {width: '200px', height: '60px'}
    };
    
    return (
        <div
            style={{
                backgroundColor: cores[type], 
                width: tamanhos[size].width,
                height: tamanhos[size].height,

                boxShadow: shadow == 'on' ? '5px 5px 5px black' : 'none',

                // estilos fixos:
                padding: '10px',
                borderRadius: '10px',
                margin: '20px',

                display: 'flex',
                justifyContent: 'center',
                alignItems: 'center'
            }}
            
            // AULA 6
            onClick={(e) => {
                console.log(numero);
                funcao(numero + 1);
            }}
        >
            <p style={{ textAlign: 'center' }}>
                {text} + {numero}
            </p>
        </div>
    )
}