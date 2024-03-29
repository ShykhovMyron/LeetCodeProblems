# <p>Table: <code>Employee</code></p>
#
# <pre>
# +-------------+------+
# | Column Name | Type |
# +-------------+------+
# | id          | int  |
# | salary      | int  |
# +-------------+------+
# id is the primary key column for this table.
# Each row of this table contains information about the salary of an employee.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to report the second highest salary from the <code>Employee</code> table. If there is no second highest salary, the query should report <code>null</code>.</p>
#
# <p>The query result format is in the following example.</p>
#
# <p>&nbsp;</p>
# <p><strong>Example 1:</strong></p>
#
# <pre>
# <strong>Input:</strong>
# Employee table:
# +----+--------+
# | id | salary |
# +----+--------+
# | 1  | 100    |
# | 2  | 200    |
# | 3  | 300    |
# +----+--------+
# <strong>Output:</strong>
# +---------------------+
# | SecondHighestSalary |
# +---------------------+
# | 200                 |
# +---------------------+
# </pre>
#
# <p><strong>Example 2:</strong></p>
#
# <pre>
# <strong>Input:</strong>
# Employee table:
# +----+--------+
# | id | salary |
# +----+--------+
# | 1  | 100    |
# +----+--------+
# <strong>Output:</strong>
# +---------------------+
# | SecondHighestSalary |
# +---------------------+
# | null                |
# +---------------------+
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 2188</li><li>👎 762</li></div>

# There is no code of Java type for this problem
SELECT MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary < (SELECT MAX(Salary) FROM Employee)