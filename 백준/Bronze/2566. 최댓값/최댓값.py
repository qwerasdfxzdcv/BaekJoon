A = [list(map(int,input().split()))for _ in range(9)]
m_num, m_row, m_col = 0, 0, 0
for row in range(9):
    for col in range(9):
        if m_num <= A[row][col]:
            m_row = row + 1
            m_col = col + 1
            m_num = A[row][col]
    
print(m_num)
print(m_row,m_col)