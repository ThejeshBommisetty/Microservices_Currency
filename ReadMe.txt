
Port's to access the application

Limits Service	8080, 8081, ..
Spring Cloud Config Server	8888
Currency Exchange Service	8000, 8001, 8002, ..
Currency Conversion Service	8100, 8101, 8102, ...
Netflix Eureka Naming Server	8761
Netflix Zuul API Gateway Server	8765


Sample URL's
http://localhost:8888/limits-service/default 
http://localhost:8888/limits-service/dev
http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/10000
http://localhost:8000/currency-exchange/from/EUR/to/INR 
http://localhost:8001/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR 
http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/10
