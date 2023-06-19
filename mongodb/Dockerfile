FROM mongo:latest

COPY mongo-init.js /docker-entrypoint-initdb.d/

RUN chmod +r /docker-entrypoint-initdb.d/mongo-init.js

EXPOSE 27017

ENTRYPOINT [ "docker-entrypoint.sh" ]

CMD ["mongod"]