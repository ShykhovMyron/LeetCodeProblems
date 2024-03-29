# <p>Table: <code>Person</code></p>
#
# <pre>
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | id          | int     |
# | email       | varchar |
# +-------------+---------+
# id is the primary key column for this table.
# Each row of this table contains an email. The emails will not contain uppercase letters.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to <strong>delete</strong> all the duplicate emails, keeping only one unique email with the smallest <code>id</code>. Note that you are supposed to write a <code>DELETE</code> statement and not a <code>SELECT</code> one.</p>
#
#     <p>After running your script, the answer shown is the <code>Person</code> table. The driver will first compile and run your piece of code and then show the <code>Person</code> table. The final order of the <code>Person</code> table <strong>does not matter</strong>.</p>
#
#     <p>The query result format is in the following example.</p>
#
#     <p>&nbsp;</p>
# <p><strong>Example 1:</strong></p>
#
# <pre>
# <strong>Input:</strong>
# Person table:
# +----+------------------+
# | id | email            |
# +----+------------------+
# | 1  | john@example.com |
# | 2  | bob@example.com  |
# | 3  | john@example.com |
# +----+------------------+
# <strong>Output:</strong>
# +----+------------------+
# | id | email            |
# +----+------------------+
# | 1  | john@example.com |
# | 2  | bob@example.com  |
# +----+------------------+
# <strong>Explanation:</strong> john@example.com is repeated two times. We keep the row with the smallest Id = 1.
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 460</li><li>👎 90</li></div>

# There is no code of Java type for this problem
DELETE p2
FROM person p1
         JOIN person p2
              ON p1.email = p2.email
WHERE p1.id < p2.id