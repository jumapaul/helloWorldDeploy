{{- define "common-helm-chart.config-map" -}}
apiVersion: v1
kind: ConfigMap
metadata:
  name: {{ .Chart.Name }}-config-map
data:
   {{- range $key, $value := .Values.configMap.data}}
   {{ $key }}: {{ $value | quote }}
   {{- end}}
{{- end -}}