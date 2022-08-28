# <p>Table: <code>Person</code></p>
#
# <pre>
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | personId    | int     |
# | lastName    | varchar |
# | firstName   | varchar |
# +-------------+---------+
# personId is the primary key column for this table.
# This table contains information about the ID of some persons and their first and last names.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Table: <code>Address</code></p>
#
# <pre>
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | addressId   | int     |
# | personId    | int     |
# | city        | varchar |
# | state       | varchar |
# +-------------+---------+
# addressId is the primary key column for this table.
# Each row of this table contains information about the city and state of one person with ID = PersonId.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to report the first name, last name, city, and state of each person in the <code>Person</code> table. If the address of a <code>personId</code> is not present in the <code>Address</code> table, report <code>null</code> instead.</p>
#
# <p>Return the result table in <strong>any order</strong>.</p>
#
# <p>The query result format is in the following example.</p>
#
# <p>&nbsp;</p>
# <p><strong>Example 1:</strong></p>
#
# <pre>
# <strong>Input:</strong>
# Person table:
# +----------+----------+-----------+
# | personId | lastName | firstName |
# +----------+----------+-----------+
# | 1        | Wang     | Allen     |
# | 2        | Alice    | Bob       |
# +----------+----------+-----------+
# Address table:
# +-----------+----------+---------------+------------+
# | addressId | personId | city          | state      |
# +-----------+----------+---------------+------------+
# | 1         | 2        | New York City | New York   |
# | 2         | 3        | Leetcode      | California |
# +-----------+----------+---------------+------------+
# <strong>Output:</strong>
# +-----------+----------+---------------+----------+
# | firstName | lastName | city          | state    |
# +-----------+----------+---------------+----------+
# | Allen     | Wang     | Null          | Null     |
# | Bob       | Alice    | New York City | New York |
# +-----------+----------+---------------+----------+
# <strong>Explanation:</strong>
# There is no address in the address table for the personId = 1 so we return null in their city and state.
# addressId = 1 contains information about the address of personId = 2.
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 2246</li><li>👎 198</li></div>

# There is no code of Java type for this problem
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
         LEFT JOIN Address a
                   ON p.personId = a.personId