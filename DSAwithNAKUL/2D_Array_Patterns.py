matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

#Print Main Diagonal & Secondary Diagonal
n = len(matrix)

main_diag = [matrix[i][i] for i in range(n)]
sec_diag  = [matrix[i][n - i - 1] for i in range(n)]

print("Main Diagonal:", main_diag)
print("Secondary Diagonal:", sec_diag)
print("\n")

#Print Matrix in Zig-Zag Order
for i, row in enumerate(matrix):
    print(*(row if i % 2 == 0 else row[::-1]), end=" ")
print("\n")

# Print Matrix in Spiral Order
top, bottom = 0, len(matrix) - 1
left, right = 0, len(matrix[0]) - 1

while top <= bottom and left <= right:
    for c in range(left, right + 1):
        print(matrix[top][c], end=" ")
    top += 1

    for r in range(top, bottom + 1):
        print(matrix[r][right], end=" ")
    right -= 1

    if top <= bottom:
        for c in range(right, left - 1, -1):
            print(matrix[bottom][c], end=" ")
        bottom -= 1

    if left <= right:
        for r in range(bottom, top - 1, -1):
            print(matrix[r][left], end=" ")
        left += 1

