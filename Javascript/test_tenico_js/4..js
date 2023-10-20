function Matrix(matrix) {
    const rows = matrix.length;
    const cols = matrix[0].length;

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (i !== j && matrix[i][j] !== 0) {
                return false;
            }
        }
    }

    return true;
}
