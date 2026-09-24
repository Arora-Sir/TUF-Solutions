SELECT
  ROUND((COUNT(CASE WHEN
        order_date=customer_pref_delivery_date
            THEN 1
        END) / COUNT(*) * 100),
    2 
  ) as immediate_percentage
FROM Delivery