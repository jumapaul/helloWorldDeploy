{{- define "common-helm-chart.config-map" -}}
apiVersion: v1
kind: ConfigMap
metadata:
  name: {{ include "common-helm-chart.configMapName" . }}
data:
   {{- range $key, $value := .Values.configMap.data}}
   {{ $key }}: {{ $value | quote }}
   {{- end}}
{{- end -}}