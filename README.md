# docker-swarm-deploy

# Pre-Requisites
    Docker Swarm SetUp
# Deploy Nginx image using commands
  1. Create a service
      
    docker service create --name my_web nginx
  ![image](https://user-images.githubusercontent.com/58024415/105355986-d35d2700-5c18-11eb-89e1-9f64342a1660.png)
  2. Check services
      
    docker service ls
  ![image](https://user-images.githubusercontent.com/58024415/105356012-dc4df880-5c18-11eb-88d2-8203c41436f0.png)  
  3. Publish service ports directly on the swarm node
  
    docker service update --publish-add published=80,target=80 my_web
  ![image](https://user-images.githubusercontent.com/58024415/105356032-e66ff700-5c18-11eb-9c95-38b9a0525317.png)
  4. Check services
      
    docker service ls
  ![image](https://user-images.githubusercontent.com/58024415/105356060-ee2f9b80-5c18-11eb-9b31-c0d1a6a7c70f.png)
  5. Update replicas using below command
    
    docker service update --replicas 3 my_web
  ![image](https://user-images.githubusercontent.com/58024415/105356095-fb4c8a80-5c18-11eb-9868-104740740576.png)
  6. Check containers in master
  
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105356129-07384c80-5c19-11eb-8912-b8259117a05a.png)
  7. Check containers in Slave
    
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105356151-10291e00-5c19-11eb-8e48-6e213a4bb192.png)
# Open port 80 and check output
  ![image](https://user-images.githubusercontent.com/58024415/105356444-6b5b1080-5c19-11eb-8fd9-ce1207e090b5.png)
