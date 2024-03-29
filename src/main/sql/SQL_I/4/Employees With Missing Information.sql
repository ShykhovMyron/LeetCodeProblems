# <p>Table: <code>Employees</code></p>
#
# <pre>
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | employee_id | int     |
# | name        | varchar |
# +-------------+---------+
# employee_id is the primary key for this table.
# Each row of this table indicates the name of the employee whose ID is employee_id.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Table: <code>Salaries</code></p>
#
# <pre>
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | employee_id | int     |
# | salary      | int     |
# +-------------+---------+
# employee_id is the primary key for this table.
# Each row of this table indicates the salary of the employee whose ID is employee_id.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to report the IDs of all the employees with <strong>missing information</strong>. The information of an employee is missing if:</p>
#
# <ul>
#  <li>The employee's <strong>name</strong> is missing, or</li>
#  <li>The employee's <strong>salary</strong> is missing.</li>
# </ul>
#
# <p>Return the result table ordered by <code>employee_id</code> <strong>in ascending order</strong>.</p>
#
# <p>The query result format is in the following example.</p>
#
# <p>&nbsp;</p>
# <p><strong>Example 1:</strong></p>
#
# <pre>
# <strong>Input:</strong>
# Employees table:
# +-------------+----------+
# | employee_id | name     |
# +-------------+----------+
# | 2           | Crew     |
# | 4           | Haven    |
# | 5           | Kristian |
# +-------------+----------+
# Salaries table:
# +-------------+--------+
# | employee_id | salary |
# +-------------+--------+
# | 5           | 76071  |
# | 1           | 22517  |
# | 4           | 63539  |
# +-------------+--------+
# <strong>Output:</strong>
# +-------------+
# | employee_id |
# +-------------+
# | 1           |
# | 2           |
# +-------------+
# <strong>Explanation:</strong>
# Employees 1, 2, 4, and 5 are working at this company.
# The name of employee 1 is missing.
# The salary of employee 2 is missing.
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 272</li><li>👎 19</li></div>

# There is no code of Java type for this problem
SELECT e.employee_id
FROM Employees e
         LEFT JOIN Salaries s
                   ON e.employee_id = s.employee_id
WHERE s.employee_id IS NULL
UNION ALL
SELECT s.employee_id
FROM Salaries s
         LEFT JOIN Employees e
                   ON s.employee_id = e.employee_id
WHERE e.employee_id IS NULL
ORDER BY employee_id