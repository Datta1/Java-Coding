String databaseUrl = "jdbc:mysql://localhost/spark";
        
ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
((JdbcConnectionSource)connectionSource).setUsername("spark");
((JdbcConnectionSource)connectionSource).setPassword("spark");