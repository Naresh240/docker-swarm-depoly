# nginx deploy

# Deploy stack deploy
    docker stack deploy --compose-file nginx-docker-stack.yml nginx-deploy
  ![image](https://user-images.githubusercontent.com/58024415/105357791-51bac880-5c1b-11eb-93d9-67bcedc0975f.png)
# List stacks
    docker stack ls
  ![image](https://user-images.githubusercontent.com/58024415/105357829-61d2a800-5c1b-11eb-9746-e1714038fb8d.png)
# List the services in the stack
    docker service ls
  ![image](https://user-images.githubusercontent.com/58024415/105357878-744ce180-5c1b-11eb-9fb4-464ff507286f.png) 
# Check docker containers in Master server
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105357915-7ca51c80-5c1b-11eb-9955-9d634f73cff7.png) 
# Check docker containers in Slave server
    docker ps -a
  ![image](https://user-images.githubusercontent.com/58024415/105357961-8cbcfc00-5c1b-11eb-94cb-7af92a949f5c.png)
