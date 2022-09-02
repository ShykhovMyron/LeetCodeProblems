# <p>Table: <code>Users</code></p>
#
# <pre>
# +----------------+---------+
# | Column Name    | Type    |
# +----------------+---------+
# | user_id        | int     |
# | join_date      | date    |
# | favorite_brand | varchar |
# +----------------+---------+
# user_id is the primary key of this table.
# This table has the info of the users of an online shopping website where users can sell and buy items.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Table: <code>Orders</code></p>
#
# <pre>
# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | order_id      | int     |
# | order_date    | date    |
# | item_id       | int     |
# | buyer_id      | int     |
# | seller_id     | int     |
# +---------------+---------+
# order_id is the primary key of this table.
# item_id is a foreign key to the Items table.
# buyer_id and seller_id are foreign keys to the Users table.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Table: <code>Items</code></p>
#
# <pre>
# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | item_id       | int     |
# | item_brand    | varchar |
# +---------------+---------+
# item_id is the primary key of this table.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to find for each user, the join date and the number of orders they made as a buyer in <code>2019</code>.</p>
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
# Users table:
# +---------+------------+----------------+
# | user_id | join_date  | favorite_brand |
# +---------+------------+----------------+
# | 1       | 2018-01-01 | Lenovo         |
# | 2       | 2018-02-09 | Samsung        |
# | 3       | 2018-01-19 | LG             |
# | 4       | 2018-05-21 | HP             |
# +---------+------------+----------------+
# Orders table:
# +----------+------------+---------+----------+-----------+
# | order_id | order_date | item_id | buyer_id | seller_id |
# +----------+------------+---------+----------+-----------+
# | 1        | 2019-08-01 | 4       | 1        | 2         |
# | 2        | 2018-08-02 | 2       | 1        | 3         |
# | 3        | 2019-08-03 | 3       | 2        | 3         |
# | 4        | 2018-08-04 | 1       | 4        | 2         |
# | 5        | 2018-08-04 | 1       | 3        | 4         |
# | 6        | 2019-08-05 | 2       | 2        | 4         |
# +----------+------------+---------+----------+-----------+
# Items table:
# +---------+------------+
# | item_id | item_brand |
# +---------+------------+
# | 1       | Samsung    |
# | 2       | Lenovo     |
# | 3       | LG         |
# | 4       | HP         |
# +---------+------------+
# <strong>Output:</strong>
# +-----------+------------+----------------+
# | buyer_id  | join_date  | orders_in_2019 |
# +-----------+------------+----------------+
# | 1         | 2018-01-01 | 1              |
# | 2         | 2018-02-09 | 2              |
# | 3         | 2018-01-19 | 0              |
# | 4         | 2018-05-21 | 0              |
# +-----------+------------+----------------+
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 280</li><li>👎 47</li></div>

# There is no code of Java type for this problem
SELECT u.user_id         AS buyer_id,
       u.join_date,
       COUNT(o.order_id) AS orders_in_2019
FROM Users u
         LEFT JOIN orders o
                   ON o.buyer_id = u.user_id
                       AND YEAR(o.order_date) = '2019'
GROUP BY u.user_id