docker image build -t customer-producer .


docker container run --name service-producer -p 8080:8080 -d customer-producer


http://localhost:8080/customer


http://service-producer:8080/customer

