# <p>Table: <code>Activity</code></p>
#
# <pre>
# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | user_id       | int     |
# | session_id    | int     |
# | activity_date | date    |
# | activity_type | enum    |
# +---------------+---------+
# There is no primary key for this table, it may have duplicate rows.
# The activity_type column is an ENUM of type ('open_session', 'end_session', 'scroll_down', 'send_message').
# The table shows the user activities for a social media website.
# Note that each session belongs to exactly one user.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to find the daily active user count for a period of <code>30</code> days ending <code>2019-07-27</code> inclusively. A user was active on someday if they made at least one activity on that day.</p>
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
# Activity table:
# +---------+------------+---------------+---------------+
# | user_id | session_id | activity_date | activity_type |
# +---------+------------+---------------+---------------+
# | 1       | 1          | 2019-07-20    | open_session  |
# | 1       | 1          | 2019-07-20    | scroll_down   |
# | 1       | 1          | 2019-07-20    | end_session   |
# | 2       | 4          | 2019-07-20    | open_session  |
# | 2       | 4          | 2019-07-21    | send_message  |
# | 2       | 4          | 2019-07-21    | end_session   |
# | 3       | 2          | 2019-07-21    | open_session  |
# | 3       | 2          | 2019-07-21    | send_message  |
# | 3       | 2          | 2019-07-21    | end_session   |
# | 4       | 3          | 2019-06-25    | open_session  |
# | 4       | 3          | 2019-06-25    | end_session   |
# +---------+------------+---------------+---------------+
# <strong>Output:</strong>
# +------------+--------------+
# | day        | active_users |
# +------------+--------------+
# | 2019-07-20 | 2            |
# | 2019-07-21 | 2            |
# +------------+--------------+
# <strong>Explanation:</strong> Note that we do not care about days with zero active users.
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 201</li><li>👎 305</li></div>

# There is no code of Java type for this problem
SELECT activity_date           AS day,
       COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE activity_date > DATE_SUB('2019-07-27', INTERVAL 30 DAY)
  AND activity_date <= '2019-07-27'
GROUP BY activity_date