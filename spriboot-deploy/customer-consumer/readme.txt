docker image build -t customer-consumer .

docker container run --name service-client -d customer-consumer