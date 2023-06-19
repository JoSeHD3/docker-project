FROM node:latest

WORKDIR /app

COPY ./app/package*.json ./

COPY ./app .

RUN npm run build

EXPOSE 3000

CMD ["npm", "start"]