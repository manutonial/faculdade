export default function Botao({ type = 'primary', size = 'medium', text, shadow = 'off', funcao }) {
    const cores = {
        primary: 'blue',
        success: 'green',
        error: 'red',
        secondary: 'grey'
    };

    const tamanhos = {
        small: { width: '100px', height: '20px' },
        medium: { width: '150px', height: '40px' },
        large: { width: '200px', height: '60px' }
    };

    return (
        <div
            style={{
                backgroundColor: cores[type],
                width: tamanhos[size].width,
                height: tamanhos[size].height,

                boxShadow: shadow === 'on' ? '5px 5px 5px black' : 'none',

                padding: '10px',
                borderRadius: '10px',
                margin: '20px',

                display: 'flex',
                justifyContent: 'center',
                alignItems: 'center',
                cursor: 'pointer'
            }}
            onClick={funcao}
        >
            <p style={{ textAlign: 'center', color: 'white' }}>
                {text}
            </p>

        </div>
    );
}
