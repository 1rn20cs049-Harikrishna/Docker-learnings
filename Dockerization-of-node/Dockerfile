FROM node

# to define the working directory
WORKDIR /app

COPY package.json package.json
COPY package-lock.json package-lock.json 

# to avoid re-install on change of the content of main.js
# taking the advantage of layer caching
RUN npm install 

COPY main.js main.js


ENTRYPOINT [ "node" , "main.js"]