# wordpress

# Pre-Requisites
    Docker Swarm SetUp
# Deploy wordpress application
    docker stack deploy --compose-file docker-stack.yml wordpress
  ![image](https://user-images.githubusercontent.com/58024415/105365122-e9bcb000-5c23-11eb-9826-05a89213f90c.png)
# Check docker containers master server
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105365180-fb05bc80-5c23-11eb-98d7-2860da039b10.png)
# Check docker containers slave server
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105365235-0b1d9c00-5c24-11eb-97cf-e19aa4433bb0.png)
# Drain master server using below command
    docker node update --availability drain ip-172-31-88-143.ec2.internal   
  ![image](https://user-images.githubusercontent.com/58024415/105365446-43bd7580-5c24-11eb-87c1-3ba2817e8eee.png)
# Check nodes of swarm cluster
    docker node ls
  ![image](https://user-images.githubusercontent.com/58024415/105366044-e70e8a80-5c24-11eb-80c1-6df1be77a4e3.png)
# Check docker containers master server
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105366083-ef66c580-5c24-11eb-96a3-f58964c8254c.png)
# Check docker containers slave server
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105366002-dc53f580-5c24-11eb-8e4c-3d3600c60214.png)
# Again we can active our master using below command
    docker node update --availability active ip-172-31-88-143.ec2.internal
  ![image](https://user-images.githubusercontent.com/58024415/105366300-305eda00-5c25-11eb-849e-bbe6ae6c039c.png)
