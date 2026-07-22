{{- define "common-helm-chart.configMapName" -}}
{{ .Chart.Name }}-config-map
{{- end -}}