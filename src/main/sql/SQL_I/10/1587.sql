# <p>Table: <code>Users</code></p>
#
# <pre>
# +--------------+---------+
# | Column Name  | Type    |
# +--------------+---------+
# | account      | int     |
# | name         | varchar |
# +--------------+---------+
# account is the primary key for this table.
# Each row of this table contains the account number of each user in the bank.
# There will be no two users having the same name in the table.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Table: <code>Transactions</code></p>
#
# <pre>
# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | trans_id      | int     |
# | account       | int     |
# | amount        | int     |
# | transacted_on | date    |
# +---------------+---------+
# trans_id is the primary key for this table.
# Each row of this table contains all changes made to all accounts.
# amount is positive if the user received money and negative if they transferred money.
# All accounts start with a balance of 0.
# </pre>
#
# <p>&nbsp;</p>
#
# <p>Write an SQL query to report the name and balance of users with a balance higher than <code>10000</code>. The balance of an account is equal to the sum of the amounts of all transactions involving that account.</p>
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
# +------------+--------------+
# | account    | name         |
# +------------+--------------+
# | 900001     | Alice        |
# | 900002     | Bob          |
# | 900003     | Charlie      |
# +------------+--------------+
# Transactions table:
# +------------+------------+------------+---------------+
# | trans_id   | account    | amount     | transacted_on |
# +------------+------------+------------+---------------+
# | 1          | 900001     | 7000       |  2020-08-01   |
# | 2          | 900001     | 7000       |  2020-09-01   |
# | 3          | 900001     | -3000      |  2020-09-02   |
# | 4          | 900002     | 1000       |  2020-09-12   |
# | 5          | 900003     | 6000       |  2020-08-07   |
# | 6          | 900003     | 6000       |  2020-09-07   |
# | 7          | 900003     | -4000      |  2020-09-11   |
# +------------+------------+------------+---------------+
# <strong>Output:</strong>
# +------------+------------+
# | name       | balance    |
# +------------+------------+
# | Alice      | 11000      |
# +------------+------------+
# <strong>Explanation:</strong>
# Alice's balance is (7000 + 7000 - 3000) = 11000.
# Bob's balance is 1000.
# Charlie's balance is (6000 + 6000 - 4000) = 8000.
# </pre>
#
# <div><div>Related Topics</div><div><li>Database</li></div></div><br><div><li>👍 202</li><li>👎 3</li></div>

# There is no code of Java type for this problem
SELECT u.name, SUM(t.amount) AS balance
FROM Transactions t
         JOIN users u
              ON t.account = u.account
GROUP BY u.name
HAVING SUM(t.amount) >= 11000