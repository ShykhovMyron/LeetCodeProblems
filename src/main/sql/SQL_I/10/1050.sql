# <p>Table: <code>ActorDirector</code></p>
#
# <pre>
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | actor_id    | int     |
# | director_id | int     |
# | timestamp   | int     |
# +-------------+---------+
# timestamp is the primary key column for this table.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write a SQL query for a report that provides the pairs <code>(actor_id, director_id)</code> where the actor has cooperated with the director at least three times.</p>
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
# ActorDirector table:
# +-------------+-------------+-------------+
# | actor_id    | director_id | timestamp   |
# +-------------+-------------+-------------+
# | 1           | 1           | 0           |
# | 1           | 1           | 1           |
# | 1           | 1           | 2           |
# | 1           | 2           | 3           |
# | 1           | 2           | 4           |
# | 2           | 1           | 5           |
# | 2           | 1           | 6           |
# +-------------+-------------+-------------+
# <strong>Output:</strong>
# +-------------+-------------+
# | actor_id    | director_id |
# +-------------+-------------+
# | 1           | 1           |
# +-------------+-------------+
# <strong>Explanation:</strong> The only pair is (1, 1) where they cooperated exactly 3 times.
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 277</li><li>👎 32</li></div>

# There is no code of Java type for this problem
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3