import React from 'react';
import ElementList from './components/ElementList';
import H1Renderer from './components/H1Renderer';

const elementsData = [
    { firstname: 'Demo1', lastname: 'User1', dni: 1234 },
    { firstname: 'Demo2', lastname: 'User2', dni: 5678 },
];

function App() {
    return (
        <div>
            <ElementList elements={elementsData} />
            <H1Renderer data="Título del encabezado" />
        </div>
    );
}

export default App;
