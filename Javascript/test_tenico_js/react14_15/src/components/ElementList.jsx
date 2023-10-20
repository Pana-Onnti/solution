import React from 'react';

function ElementList(props) {
    const { elements } = props;

    return (
        <ul>
            {elements.map((element, index) => (
                <li key={index}>
                    <span>First Name: {element.firstname}</span>
                    <span>Last Name: {element.lastname}</span>
                    <span>DNI: {element.dni}</span>
                </li>
            ))}
        </ul>
    );
}

export default ElementList;
