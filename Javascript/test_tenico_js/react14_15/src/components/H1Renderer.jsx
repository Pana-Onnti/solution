import React from 'react';

function H1Renderer(props) {
    const { data } = props;

    return <h1>{data}</h1>;
}

export default H1Renderer;