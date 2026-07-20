
{{- define "common-helm-chart.deployment" -}}
apiVersion: apps/v1
kind: Deployment
metadata:
  name: {{ .Release.Name }}-deployment
  labels:
    app: {{ .Chart.Name }}
spec:
  replicas: {{ .Values.replicaCount }}
  selector:
    matchLabels:
      app: {{ .Chart.Name }}
  template:
    metadata:
      labels:
        app: {{ .Chart.Name }}
    spec:
      containers:
        - name: {{ .Release.Name }}
          image: {{ .Values.image.repository}}:{{ .Values.image.tag }}
          ports:
            - containerPort: {{ .Values.containerPort }}
          env:
            {{- range .Values.env }}
            - name: {{ .name }}
              valueFrom:
                {{- toYaml .valueFrom | nindent 16 }}
            {{- end }}
          {{- if .Values.secretVolume }}
          volumeMounts:
            - name: {{ .Values.secretVolume.name }}
              mountPath: {{ .Values.secretVolume.mountPath }}
              readOnly: true
           {{- end }}
      {{ if .Values.secretVolume }}
      volumes:
        - name: {{ .Values.secretVolume.name }}
          secret:
            secretName: {{ .Values.secretVolume.secretName }}
      {{- end }}
{{- end -}}