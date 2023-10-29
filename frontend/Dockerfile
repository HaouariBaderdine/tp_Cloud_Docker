# Étape 1: Construire l'application Angular
        FROM node:14 as builder
        WORKDIR /app
        COPY package.json package-lock.json ./
        RUN npm install
        COPY . .
        RUN npm run build

        # Étape 2: Servir l'application avec Nginx
        FROM nginx:1.17.1-alpine
        COPY --from=builder /app/dist/frontend /usr/share/nginx/html
        EXPOSE 80
        CMD ["nginx", "-g", "daemon off;"]