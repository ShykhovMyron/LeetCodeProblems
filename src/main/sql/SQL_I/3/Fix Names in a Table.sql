# <p>Table: <code>Users</code></p>
#
# <pre>
# +----------------+---------+
# | Column Name    | Type    |
# +----------------+---------+
# | user_id        | int     |
# | name           | varchar |
# +----------------+---------+
# user_id is the primary key for this table.
# This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to fix the names so that only the first character is uppercase and the rest are lowercase.</p>
#
# <p>Return the result table ordered by <code>user_id</code>.</p>
#
# <p>The query result format is in the following example.</p>
#
# <p>&nbsp;</p>
# <p><strong>Example 1:</strong></p>
#
# <pre>
# <strong>Input:</strong>
# Users table:
# +---------+-------+
# | user_id | name  |
# +---------+-------+
# | 1       | aLice |
# | 2       | bOB   |
# +---------+-------+
# <strong>Output:</strong>
# +---------+-------+
# | user_id | name  |
# +---------+-------+
# | 1       | Alice |
# | 2       | Bob   |
# +---------+-------+
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 282</li><li>👎 55</li></div>

# There is no code of Java type for this problem
SELECT user_id,
       CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2))) AS name
FROM users
ORDER BY user_id